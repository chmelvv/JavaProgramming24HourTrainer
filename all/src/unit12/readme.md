# Walkthrough	1
- [x] Download	the	latest	Derby	DB	(binary	distribu7on)	from http://db.apache.org/derby/derby_downloads.html
- [x] Unzip	it	in	any	directory	and	set	DERBY_HOME	and	PATH	variables according	to	instruc7ons	at	hZp://bit.ly/11pe06H
- [x] From	the	command	prompt	run	sysinfo	command:

- [x] Start	Derby	in	a	command	window	by	typing       startNetworkServer.

- [x] Open	another	command	window,	start	Derby’s	u7lity	ij,		and	 connect	to	your	database	server	crea7ng	the	Lesson22	database:
```
connect	‘jdbc:derby:Lesson22;create=true’;
      					or
connect	‘jdbc:derby://localhost:1527/Lesson22;create=true’;
```
- [x] Using	the	ij	u7lity	create	the	table	Employee:
```
      CREATE TABLE Employee ( EMPNO int NOT NULL, ENAME varchar (50)
      NOT NULL, JOB_TITLE varchar (150) NOT NULL );
```
- [x] Insert	three	rows	into	the	table	Employee:
```
      INSERT INTO Employee values (7369,'John Smith', 'Clerk'),       (7499,'Joe Allen','Salesman'), (7521,'Mary Lou','Director');
```
- [x] Test	that	the	data	were	saved	in	the	db:
```
      Select * from Employee;
```
# Walkthrough	2
- [x] Download	and	import	into	Eclipse	the	sample	code	form	Lesson	22.
      You’ll	see	an	error	about	the	missing	DB	driver	derbyclient.jar.	Find	it
      in	the	lib	directory	of	your	Derby	installa7on	and	add	it	to	the	build
      path	of	your	your	project.
- [x] Review	the	code	with	the	instructor
- [x] Run	the	applica7on	–	it	should	display	the	list	of	employees:
```
      						7369,	John	Smith,	Clerk
      						7499,	Joe	Allen,	Salesman
      						7521,	Mary	Lou,	Director
```
Note: If	you	see	the	error	“Failed	to	start	database	'Lesson22'	…	Another	instance	of	      Derby	may	have	already	booted	the	database”,		exit	the	ij	u7lity	with	exit;	command.

You	can	read	more	about	specifics	of	running	embedded	Derby	DB	instance	at	      hZp://db.apache.org/derby/papers/DerbyTut/embedded_intro.html
- [x] Rewrite example from DriverManager to DataSource.
http://db.apache.org/derby/docs/10.7/adminguide/cadminnsdatasources.html
http://db.apache.org/derby/docs/10.7/adminguide/radminnsdatasourcexmp.html

# Homework
- [x] Study	the	materials	from	the	lessons	22.
- [x] Do the	assignment	from	the	Try	It	sec7on	of	Lesson	22.

# Challenge	Yourself
- [ ] Download	and	install	DBMS	Oracle	11g	Express	edi7on		from
  hZp://bit.ly/Qmkzpt	.	During	the	installa7on	enter	(and	memorize)	the
  passwords	for	SYS	and	SYSTEM	accounts.
- [ ] Download	Oracle	SQL	Developer	from	hZp://bit.ly/1bAq4Y7.	Unzip	it	into	any
  folder.	SQL	Developer	doesn’t	support	Java	8	yet,	so	you’ll	need	to	install	Java	7.
- [ ] Run	the	sqldeveloper.exe	located	in	sqldeveloper	subfolder.	Specify	where	your
  JDK	is	installed,	e.g	C:\Program	Files\Java\jdk1.7.0_55.
- [ ] For	instruc7ons	on	using	SQL	Developer	follow	this	video:
  hZps://www.youtube.com/watch?v=ZINT9tCl20g.
- [ ] Use	Eclipse	plugin	for	Oracle:	hZp://bit.ly/rYIDid
- [ ] You	can	get	ojdbc7.jar,	the	thin	Oracle	JDBC	driver	at	hZp://bit.ly/1d4rn1Z