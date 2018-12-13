Run sourceanalyzer on ResourceInjection.java by running the following commands:

$ sourceanalyzer -b java1.5 -clean
$ sourceanalyzer -b java1.5 -source 1.5 ResourceInjection.java
$ sourceanalyzer -b java1.5 -scan -f java15.fpr

Use audit workbench to open java15.fpr.  The result file should have one
Path Manipulation result and one J2EE Bad Practices result.

The Path Manipulation result indicates that user input passing from the program
arguments, through ArrayList, and into the File constructor on line 9 can
manipulate the file name.
