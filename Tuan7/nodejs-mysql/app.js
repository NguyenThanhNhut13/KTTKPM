const express = require('express');
const mysql = require('mysql2/promise');
const app = express();
const port = 3000;

// Kết nối đến MySQL
const pool = mysql.createPool({
  host: 'mysql',
  user: 'user',
  password: 'password',
  database: 'mydb',
  waitForConnections: true,
  connectionLimit: 10,
  queueLimit: 0
});

// Kiểm tra kết nối
app.get('/', async (req, res) => {
  try {
    const conn = await pool.getConnection();
    conn.release();
    res.send('Kết nối đến MySQL thành công!');
  } catch (error) {
    res.status(500).send('Không thể kết nối đến MySQL: ' + error.message);
  }
});

// Tạo bảng users nếu chưa tồn tại
app.get('/setup', async (req, res) => {
  try {
    const conn = await pool.getConnection();
    await conn.query(`
      CREATE TABLE IF NOT EXISTS users (
        id INT AUTO_INCREMENT PRIMARY KEY,
        name VARCHAR(255) NOT NULL,
        email VARCHAR(255) NOT NULL
      )
    `);
    conn.release();
    res.send('Đã tạo bảng users!');
  } catch (error) {
    res.status(500).send('Lỗi: ' + error.message);
  }
});

app.listen(port, () => {
  console.log(`App listening at http://localhost:${port}`);
});