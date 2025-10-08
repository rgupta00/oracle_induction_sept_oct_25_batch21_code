const express = require('express');
const app = express();

app.use((req, res, next) => {
  console.log(' Middleware called -', req.method, req.url);
  next(); // hand over to next middleware or route handler
});

const callback1 = (req, res, next) => {
    console.log('callback 1');
    next();
};
const callback2 = (req, res, next) => {
    console.log('callback 2');
    next();
};

app.get('/home', [callback1, callback2], (req, res) => res.send('home'));


// Simple route
app.get('/hello', (req, res) => {
  res.send('👋 Hello, Express + Middleware!');
});


app.get('/', function(req, res){
    res.send('express js working!!')
}).listen(4000);

console.log('server is running');