# Walkthrough   1

- [x]   Start
  the
  Open
  MQ
  server:
  Open
  command
  (or
  Terminal)
  window,
  change
  (cd)
  to
  glassfish4/mq/bin
  directory,
  and
  start
  the
  Open
  MQ
  broker.
  In
  Windows
  OS
  run
  imqbrokerd.exe,
  in
  MAC
  OS
  do
  ./imqbrokerd
  -­‐port
  7677

- [x]   Start
  Open
  MQ
  Admin
  Console:
  Open
  another
  Command
  or
  Terminal
  window,
  go
  to
  glassfish4/mq/bin
  directory
  again,
  and
  start
  the
  admin
  GUI
  tool
  imqadmin
  to
  create
  the
  required
  messaging
  desTnaTons.

- [x] Create   new
  message
  broker:
  Right-­‐click
  on
  Brokers
  and
  add
  a
  new
  broker
  and
  named
  StockBroker,
  change
  the
  port
  to
  7677,
  enter
  the
  password
  admin,
  and
  press
  OK.

- [x]   Connect
  to
  the
  StockBroker
  (right-­‐click
  menu),
  and
  add
  broker
  desTnaTon
  (right-­‐click
  menu)
  named
  TestQueue.
  On
  MAC
  you
  might
  get
  the
  error
  “Unsupported
  major.minor
  version
  51.0”.
  To
  fix
  it,
  export
  JAVA_HOME
  export
  JAVA_HOME=`/usr/libexec/java_home`
  and
  start
  the
  imqbrokerd
  (and
  imqadmin)
  with
  parameter,
  for
  example:
  ./imqbrokerd
  -­‐javahome
  $JAVA_HOME
  -­‐port
  7677
  ./imqadmin
  -­‐javahome
  $JAVA_HOME

- [x] Download
  the
  code
  for
  Lesson
  30
  and
  import
  it
  into
  Eclipse

- [x]   Go
  to
  the
  project
  ProperTes
  |
  Java
  Build
  Path
  and
  add
  two
  jars
  in
  the
  Library
  secTon:
  imq.jar
  and
  jms.jar
  located
  in
  the
  glassfish4/mq/lib.

- [x]   Review
  the
  code
  of
  the
  MessageSender
  –
  it
  connects
  to
  the
  MOM
  that
  runs
  on
  port
  7677.

- [x]    Start
  MesageReceiver
  and
  it’ll
  print
  Listening
  to
  the
  TestQueue...

- [x]   Run
  MessageSender.
  It’ll
  place
  the
  message
  in
  TestQueue
  and
  will
  print
  Successfully
  placed
  an
  order
  to
  purchase
  200
  shares
  of
  IBM.

- [x]   Check
  the
  console
  of
  the
  MessageReceiver.
  It
  received
  the
  message
  and
  printed
  Got
  from
  the
  queue:
  IBM
  200
  Mkt

- [x]    Go
  back
  to
  Slide
  3
  and
  review
  the
  diagram.
  It
  should
  make
  more
  sense
  now.

# Homework
- [x]    Study
  the
  materials
  from
  the
  lessons
  30
  and
  31
  from
  the
  textbook.

- [x]     Do
  the
  assignments
  from
  the
  Try
  It
  secTons
  of
  the
  lesson   31.
