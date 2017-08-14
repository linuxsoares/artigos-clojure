(ns hello-web-app.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [hello-web-app.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[hello-web-app started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[hello-web-app has shut down successfully]=-"))
   :middleware wrap-dev})
