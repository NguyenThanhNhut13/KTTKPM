from flask import Flask

app = Flask(__name__)

@app.route('/')
def home():
    return "Hello, Docker Flask! \n 21140001 - Nguyễn Thanh Nhứt"

if __name__== '__main__':
    app.run(host='0.0.0.0', port=5000)