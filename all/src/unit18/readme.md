# Walkthrough	(start)
- [x] Create	a	dynamic	web	project	called	Lesson34	in	Eclipse.
- [x] Download	and	unzip	Lesson34	from	http://myflex.org/yf/java/slides/Lesson34.zip
- [x] Copy	the	content	of	the	downloaded	src	folder	into	the	src	folder	from	Lesson34
  project	(the	classes	StockApplication,	Stock,	StockResource,	and
  StockService).
- [x] Deploy	the	project	Lesson34	under	GlassFish	in	Eclipse	(the	menu	Add	and
  Remove)
- [x] Go	to	Lesson34	project	property	and	in	Project	Facets	select	JAX-RS	checkbox
- [x] Start	GlassFish	server.	The	console	should	contain	the	message	“Lesson34	was
  successfully	deployed”.
- [x] Enter	the	URL	hTp://localhost:8080/Lesson34/resjulstocks/stock.	You’ll	get	the
      error	405	–	method	not	allowed.
- [x] Enter	the	URL	hTp://localhost:8080/Lesson34/resjulstocks/stock/IBM	.	You’ll	get
      something	like	this:

http://localhost:8080/RestExample/restfulstocks/stock/APPL