#!/bin/sh

echo $TEST_CMD
#mkdir $TEST_CMD
cd /opt
ls
ant -version


echo "**********************Running FIREFOX cases using ANT inside test:local container*************************"
ant FireFoxDriver
echo "**********************************************************************************************************"


echo "**********************Running FIREFOX cases using ANT inside test:local container*************************"
ant ChromeDriver
echo "**********************************************************************************************************"



