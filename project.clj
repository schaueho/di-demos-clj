(defproject playitloud "0.1.0-SNAPSHOT"
  :description "a silly dependency demo app"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [de.find-method/funsig "0.1.2"]
                 [clj-di "0.5.0"]
		 [com.stuartsierra/component "0.3.1"]
                 [mount "0.1.9"]]
  :main ^:skip-aot playitloud.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :dev {:dependencies [[midje "1.8.3"]]
	     	   :plugins [[lein-midje "3.2"]]}})
