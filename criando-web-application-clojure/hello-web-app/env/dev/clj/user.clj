(ns user
  (:require [mount.core :as mount]
            hello-web-app.core))

(defn start []
  (mount/start-without #'hello-web-app.core/repl-server))

(defn stop []
  (mount/stop-except #'hello-web-app.core/repl-server))

(defn restart []
  (stop)
  (start))


