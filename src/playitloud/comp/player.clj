(ns playitloud.comp.player
  (:require [com.stuartsierra.component :as component]
            [playitloud.output-device :as output]
            [playitloud.musiccoll :as mc]))

(defrecord Player [output-device]
  component/Lifecycle)

(defn play [player randomize]
  (let [songs (mc/get-songs)
        songs (if randomize (shuffle songs) songs)]
    (map (fn [song]
           (output/blare (:output-device player) song))
         songs)))

(defn new-player [config]
  (->Player nil))
