(defproject com.ingemark/pbxis "0.1.0-SNAPSHOT"
  :description "Asterisk Call Center Adapter"
  :url "http://www.inge-mark.hr"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojure/core.incubator "0.1.2"]
                 [org.slf4j/slf4j-api "1.6.1"]
                 [org.slf4j/log4j-over-slf4j "1.6.4"]
                 [ch.qos.logback/logback-classic "1.0.3"]
                 [org.asteriskjava/asterisk-java "1.0.0.M3" :exclusions [[log4j/log4j]]]]
  :plugins [[lein-swank "1.4.4"]])
