(ns playitloud.services)
;  (:require [playitloud.speaker]
;  	    [playitloud.musiccoll]))

(def ^:dynamic *services*
  {:blare playitloud.speaker/blare
   :get-songs playitloud.musiccoll/get-songs})
