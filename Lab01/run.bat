cls
rmdir .\bin\ /s/q
mkdir .\bin
javac -encoding UTF-8 src\com\sample\IdentityCheck.java src\test\IdentityCheckTest.java -d bin
java -classpath bin test.IdentityCheckTest

::[CMD] 目錄與檔案管理常用指令
::https://edisonx.pixnet.net/blog/post/57090736