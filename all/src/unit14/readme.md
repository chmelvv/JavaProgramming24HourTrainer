# Walkthrough	1	(Installing	GlassFish	4)
- [x] Download	and	unzip	GlassFish-4.0.zip	(quick	start)	from
      https://glassfish.java.net/download.html
- [x] In	the	Command	(or	Terminal)	Window	switch	to	the	directory
      glassfish4/bin	and	run		./asadmin	start-domain	domain1.
      Windows	users	should	run	asadmin.bat	start-domain	domain1.
- [x] Test	your	install	by	entering		http://localhost:8080	-	you’ll	see	a
Web	page	staPng	that	GlassFish	server	is	running.
- [x] Open	the	admin	console	by	visiPng
http://localhost:4848
- [x] For	start/stop	instrucPons	refer	to		Quick	Start	Guide,	secPon
StarPng	and	Stopping	the	Default	Domain:
https://glassfish.java.net/docs/4.0/quick-start-guide.pdf

# Walkthrough	2
- [x] Create	a	plain	text	file	BookSearch.html	with	the	content	from	the
previous	slide.
- [x] Open	this	file	in	a	web	browser	using	the	menu	File	|	Open,	and
enter	any	text	in	the	input	field	and	press	the	buJon	Search.
- [x] You’ll	get	the	error	message	because	there	is	neither	server,	nor
servlet	FindBooks at	this	address.

# Walkthrough	3:	IDEA	+	Glassfish
- [x] Shut	down	the	GlassFish	server	if	it’s	running	()	-	run
./asadmin	stop-domain	located	in		bin	folder.
- [x] In	Eclipse	switch	to	Java	EE	perspecPve.
- [x] Right-click	inside	the	Servers	view.	Select	New	|	Server.	You	should	see
GlassFish	4.0	in	the	list.		If	not	–	click	on	Download	AddiPonal	Server
adapters	and	install	GlassFish	Tools
- [x] Select	GlassFish	4.0	and	press	Next.
- [x] One	the	next	Window,	Select	JDK	7.	Press	Browse	and	select	the	folder
glassfish	located	inside	glassfish4.	Press	Next.
- [x] Press	Finish	on	the	next	window	–	no	password	required.
- [x] You’ll	see	GlassFish	in	Eclispe	Servers	View.	Right-click	and	start	it.
- [x] In	Eclipse	for	Java	EE	Developers	switch	to
Java	EE	perspecPve	and	create	Dynamic	Web
Project	using	the	File	|	New	menu.
- [x] You	can	also	find	see	this	menu	under	File	|
New	|	Other	|	Web

# Walkthrough	4 (with IDEA)
- [x] Create	a	dynamic	Web	project	by	selecPng	Eclipse	menu		File	|	New	|	Other	|
Web	|	Dynamic	Web	Project.	Name	it	lesson27.
- [x] In	the	dropdown	Target	runPme	is	GlassFish	4.0.	Press	Next,	Next,	and	Finish.
- [ ]Observe	the	folder	WebContent in	your	project.	This	is	your	server-side
deployment	part.
- [x] Create	new	servlet:	right-click	on	the	project	name	and	select	New	|	Servlet.
Specify	com.pracPcaljava.lesson27	as	the	name	of	the	Java	package	and
FindBooks	as	the	class	name.	Press	Next.
- [x] In	the		URL	Mappings	box	select	FindBooks,	press	Edit,		and	enter	/book	in	the
PaJerns	field.	Press	OK	and	Finish.
- [x] In	the	next	window	press	Finish.
- [x] In	the	generated	code	note	the	annotated	class	declaraPon	and	methods
doGet() and	doPost().
- [x] Add	the	following	two	lines	inside	the	method	doGet():
PrintWriter out = response.getWriter();
out.println("Hello from FindBooks");
- [x] Correct	the	errors	by	imporPng	the	PrintWriter class.
- [x] Deploy	the	servlet	in	GlassFish:	open	the	Servers	view,	right-click	on	the	server	and
select	Add	and	Remove	from	the	menu.	Select	lesson27	in	the	lei	panel	and	add	it	to	the
right	one.	Check	the	content	of	the	directory,	where	this	app	is	deployed:
glassfish4/glassfish/domains/domain1/eclipseApps
- [x] Run	the	servlet:	right-click	on	FindBooks	and	select	Run	on	Server.	Confirm	deployment
under	GlassFish.	Eclipse	will	start	its	internal	browser	and	display	the	following:
- [x] Copy	the	servlet’s	URL	http://localhost:8080/lesson27/book	from	Eclipse	to	your	Web
Browser	-	you’ll	see	the	same	output.

# Homework
- [x] Study	all	the	materials	from	Lessons	25-27	from	the	textbook.
- [x] Study		the	following	HTTP	Protocol	tutorial	from	tutsplus.com:
    a)	Part	1:	http://bit.ly/17mLK87
    b)	Part	2:	http://bit.ly/11S639i
- [ ] Do	the	assignment	from	the	Try	It	secPon	of	the	lesson	27.
- [x] After	step	1	is	complete,	stop	GlassFish	and	start	it	in	the	Debug
mode.	Set	a	breakpoint	in	the	servlet’s	doGet() method.
- [x] Submit	the	stock	price	request	from	your	HTML	file and	observe
the	values	of	the	local	variables	in	doGet()while	stepping
through		the	Java	code	in	the	Eclipse	debugger.

# AddiPonal	materials
- [ ] Watch	the	video	on	gehng	started	with	GlassFish	4
http://www.youtube.com/watch?v=DQpiuweG7W8
- [ ] Servlets:		http://www.servletworld.com/
- [ ] Eclipse	doc	on	Web	modules	and	WAR	files:
http://goo.gl/7iIkIq
- [ ] GlassFish	server	documentaPon:
http://glassfish.java.net/docs/		
