FROM node:4.1.1-onbuild
MAINTAINER Selenium <selenium-developers@googlegroups.com>

ENV TEST_CMD ""
# The remainder of this build will be completed by the upstream image's ONBUILD commands




#RUN echo "deb http://archive.ubuntu.com/ubuntu trusty main universe restricted multiverse" > /etc/apt/sources.list





RUN apt-get update

#RUN sed -i.bak 's/main$/main universe/' /etc/apt/sources.list
#RUN apt-get update
#RUN apt-get upgrade -y
# Install and setup project dependencies
#RUN apt-get install -y curl wget
#RUN locale-gen en_US en_US.UTF-8
#prepare for Java download
#RUN apt-get install -y python-software-properties --force-yes
#RUN apt-get install -y software-properties-common --force-yes
#grab oracle java (auto accept licence)
#RUN add-apt-repository -y ppa:webupd8team/java
#RUN add-apt-repository ppa:webupd8team/java -y
#RUN apt-get update
#RUN echo oracle-java7-installer shared/accepted-oracle-license-v1-1 select true | /usr/bin/debconf-set-selections
#RUN apt-get install -y oracle-java7-installer




#RUN apt-get install software-properties-common python-software-properties -y --force-yes
#RUN add-apt-repository ppa:webupd8team/java -y
#RUN apt-get update
#RUN echo debconf shared/accepted-oracle-license-v1-1 select true | debconf-set-selections
#RUN apt-get install oracle-java8-installer -y
#RUN apt-get install oracle-java8-set-default

RUN apt-get install -y openjdk-7-jdk
RUN apt-get install -y ant






ADD ./run.sh /usr/bin/run.sh
RUN chmod +x /usr/bin/run.sh

CMD ["/bin/sh","-e","/usr/bin/run.sh"]

