const express = require('express');
const app = express();
const PORT = 3000;

app.get('/', (req, res) => {
    res.send('Hello, Docker! <br/> 21140001 - Nguyễn Thanh Nhứt');
});

app.listen(PORT, () => {
    console.log(`Server is running on http://localhost:${PORT}`);
});