(ns hello-web-app.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[hello-web-app started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[hello-web-app has shut down successfully]=-"))
   :middleware identity})
