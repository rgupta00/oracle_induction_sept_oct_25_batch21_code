const http = require("http");
const srvr = http.createServer(function (req, res) {
    res.writeHead(200, { 'Content-Type': 'text/plain' });
    res.end('Hello World\n');
});

srvr.listen(8081);
console.log('Server running at http://127.0.0.1:8081/');
