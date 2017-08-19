(ns import-java-clojure.import-java-clojure
  (:import
    java.util.Date
    java.text.SimpleDateFormat))



(def date (Date.))
(def sdf (SimpleDateFormat. "MM/dd/yyyy"))

(println (.toUpperCase "clojure with java"))


(.format (SimpleDateFormat. "MM/dd/yyyy") (Date.))

(.format sdf (Date.))

(.format (SimpleDateFormat. "MM/dd/yyyy") date)

(.format sdf date)

(println (System/getProperty "java.vm.version"))



