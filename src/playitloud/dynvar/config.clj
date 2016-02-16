(ns playitloud.dynvar.config)

(def ^:dynamic *connection*
  {:name "Fabuluous-Connectivity"
   :port "1234"
   :color "blue"})

(def ^:dynamic *streamer*
  {:connection *connection*})
