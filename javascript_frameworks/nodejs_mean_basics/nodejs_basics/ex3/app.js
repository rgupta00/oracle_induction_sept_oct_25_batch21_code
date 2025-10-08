const mysql = require('mysql2');

const conn = mysql.createConnection({
  host: "localhost",
  user: "root",
  password: "root",
  database: "ora123"
});



conn.query("SELECT * FROM emp_table", (err, result) => {
  if (err) throw err;
  result.forEach(row => console.log(JSON.stringify(row)));
  conn.end();
});

console.log('end')