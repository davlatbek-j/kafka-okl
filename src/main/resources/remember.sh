#Run zookeeper server
bin/zookeeper-server-start.sh config/zookeeper.properties
#Run kafka server
bin/kafka-server-start.sh config/server.properties
#rm -r  /tmp/kafka-logs
