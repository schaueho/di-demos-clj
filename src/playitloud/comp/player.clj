(ns playitloud.comp.player
  (:require [com.stuartsierra.component :as component]
            [playitloud.comp.output-device :as output]
            [playitloud.musiccoll :as mc]))

(defrecord Player [output-device]
  component/Lifecycle
  (start [player]
    (println "Player started with output-device " (:output-device player))
    player)
  (stop [player]
    (println "Player stopped")
    player))

(defn play [player randomize]
  (let [songs (mc/get-songs)
        songs (if randomize (shuffle songs) songs)]
    (map (fn [song]
           (output/blare (:output-device player) song))
         songs)))

(defn new-player []
  (->Player nil))
