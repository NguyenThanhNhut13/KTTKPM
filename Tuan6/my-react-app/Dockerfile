# Sử dụng Node.js 18 Alpine làm base image
FROM node:18-alpine

# Thiết lập thư mục làm việc
WORKDIR /app

# Copy toàn bộ file vào container
COPY . .

# Cài đặt dependencies
RUN npm install

# Build ứng dụng React
RUN npm run build

# Cài đặt server web đơn giản
RUN npm install -g serve

# Expose cổng 3000
EXPOSE 3000

# Chạy ứng dụng
CMD ["serve", "-s", "build", "-l", "3000"]