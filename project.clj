(defproject coca_query "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [clj-webdriver/clj-webdriver "0.6.0"]
                 [com.github.detro.ghostdriver/phantomjsdriver "1.0.3"]
                 [enlive "1.1.5"]]
  :main ^:skip-aot coca_query.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
