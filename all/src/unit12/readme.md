# Walkthrough	1
- [ ] Download	the	latest	Derby	DB	(binary	distribu7on)	from http://db.apache.org/derby/derby_downloads.html
- [ ] Unzip	it	in	any	directory	and	set	DERBY_HOME	and	PATH	variables according	to	instruc7ons	at	hZp://bit.ly/11pe06H
- [ ] From	the	command	prompt	run	sysinfo	command:

- [ ] Start	Derby	in	a	command	window	by	typing       startNetworkServer.

- [ ] Open	another	command	window,	start	Derby’s	u7lity	ij,		and	 connect	to	your	database	server	crea7ng	the	Lesson22	database:
```
connect	‘jdbc:derby:Lesson22;create=true’;
      					or
connect	‘jdbc:derby://localhost:1527/Lesson22;create=true’;
```
- [ ] Using	the	ij	u7lity	create	the	table	Employee:
```
      CREATE TABLE Employee ( EMPNO int NOT NULL, ENAME varchar (50)
      NOT NULL, JOB_TITLE varchar (150) NOT NULL );
```
- [ ] Insert	three	rows	into	the	table	Employee:
```
      INSERT INTO Employee values (7369,'John Smith', 'Clerk'),
      (7499,'Joe Allen','Salesman'), (7521,'Mary Lou','Director');
```
- [ ] Test	that	the	data	were	saved	in	the	db:
```
      Select * from Employee;
```
# Walkthrough	2
- [ ] Download	and	import	into	Eclipse	the	sample	code	form	Lesson	22.
      You’ll	see	an	error	about	the	missing	DB	driver	derbyclient.jar.	Find	it
      in	the	lib	directory	of	your	Derby	installa7on	and	add	it	to	the	build
      path	of	your	your	project.
- [ ] Review	the	code	with	the	instructor
- [ ] Run	the	applica7on	–	it	should	display	the	list	of	employees:
```
      						7369,	John	Smith,	Clerk
      						7499,	Joe	Allen,	Salesman
      						7521,	Mary	Lou,	Director
```
Note.
If	you	see	the	error	“Failed	to	start	database	'Lesson22'	…	Another	instance	of	      Derby	may	have	already	booted	the	database”,		exit	the	ij	u7lity	with	exit;	command.

You	can	read	more	about	specifics	of	running	embedded	Derby	DB	instance	at	      hZp://db.apache.org/derby/papers/DerbyTut/embedded_intro.html

# Homework
- [ ] Study	the	materials	from	the	lessons	22.
- [ ] Do the	assignment	from	the	Try	It	sec7on	of	Lesson	22.
- [ ] Study	SQL:	hZp://www.sqlcourse.com/
- [ ] Get	familiar	with	working	with	DerbyDB	from	Eclipse: hZp://www.vogella.de/ar7cles/EclipseDataToolsPlazorm/
