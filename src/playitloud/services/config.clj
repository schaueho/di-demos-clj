(ns playitloud.services.config)

(def ^:dynamic *services*
  {:blare playitloud.speaker/blare
   :get-songs playitloud.musiccoll/get-songs})
