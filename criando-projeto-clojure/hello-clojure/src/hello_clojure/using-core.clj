(ns hello-clojure.using-core
  (use
    [hello-clojure.core :as core]))

(def x
  (core/foo core/param))
