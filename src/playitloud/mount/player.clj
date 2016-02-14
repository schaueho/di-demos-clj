(ns playitloud.mount.player
  (:require [mount.core :refer [defstate]]
            [playitloud.mount.streamer :refer [streamer blare]]
            [playitloud.musiccoll :as mc]))

(defn create-player [streamer]
  (println "Will use streamer " streamer)
  {:streamer streamer})

(defstate player :start (create-player streamer))

(defn play [randomize]
  (let [songs (mc/get-songs)
        songs (if randomize (shuffle songs) songs)]
    (map (fn [song]
           (blare (:streamer player) song))
         songs)))
