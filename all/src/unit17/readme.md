# Walkthrough	1	(start)
- [x] Download	the	code	from	Lesson	32	from	the	textbook	site.	Unzip	it	into
  a	folder.
- [x] In	Eclipse,	create	new	Dynamic	Web	Project	called	ServletEJB.
- [x] Copy	the	content	of	the	unzipped	src	folder	into	the	Java	Resources/src
  in	Eclipse.
- [x] Deploy	the	project	to	GlassFish	4	in	Eclipse	(right-click,	menu	Add	and
  Remove)
- [x] Start	GlassFish	and	note	the	lines	“Portable	JNDI	names”	in	server
  console.
- [x] Run	HelloWorldServlet	–	there	is	no	output	and	no	error	messages.
- [x] Fix	the	bug	in	line	46	(replace	e.getStackTrace() with
      e.printStackTrace()).
- [x] Restart	the	server	and	re-run	the	servlet.	You’ll	see	the	stack	trace
      output	in	the	server	console	–	there	is	a	wrong	JNDI	lookup	string.
- [x] Replace	lesson32	with	ServletEJB	in	the	lookup	string	(line	40).
- [x] Restart	the	server	if	needed.	Re-run	the	servlet	–	it	print	the	output	now.
- [x] Comment	out	two	lines	that	do	JNDI	lookup	and	add	the	class	variable
      with	resource	injecMon	instead:
      @EJB HelloWorldBean myBean;
- [x] Run	the	program	–	the	output	is	the	same.