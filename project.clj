(defproject hazlo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.immutant/web "2.1.6"]]
  :main ^:skip-aot hazlo.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
