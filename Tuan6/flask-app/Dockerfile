# Sử dụng Python 3.9 làm base image
FROM python:3.9

# Thiết lập thư mục làm việc
WORKDIR /app

# Copy các file vào container
COPY . .

# Cài đặt depedencies
RUN pip install -r requirements.txt

# Expose cổng 5000
EXPOSE 5000

# Chạy ứng dụng Flask
CMD ["python", "app.py"]

