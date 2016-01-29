(ns playitloud.services
  (:require [playitloud.speaker]))

(def ^:dynamic *services*
  {:blare playitloud.speaker/blare})
