# Stage 1: Build
FROM node:18 as builder

# Thiết lập thư mục làm việc
WORKDIR /app

# Copy toàn bộ file vào container
COPY . .

# Cài đặt dependencies
RUN npm install

# Stage 2: Run
FROM node:18-alpine

# Thiết lập thư mục làm việc
WORKDIR /app

# Copy từ Stage 1 sang Stage 2
COPY --from=builder /app .

# Expose cổng 3000
EXPOSE 3000

# Chạy ứng dụng
CMD ["node", "server.js"]