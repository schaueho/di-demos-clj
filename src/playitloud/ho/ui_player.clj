; -----------------------------------------------------------
(ns playitloud.ho.ui-player
  (:require [playitloud.ho.player :as ho :refer [play]]
            [playitloud.speaker :as speaker]
            [playitloud.headphone :as headphone]
            [playitloud.blue-streamer :as streamer]
            [playitloud.musiccoll :refer [get-songs]]))

(defn play-pressed [speaker randomize]
  (println "User pressed play")
  (condp = speaker
    :speaker   (play speaker/blare get-songs randomize)
    :headphone (play headphone/blare get-songs randomize)
    :stream    (play streamer/blare get-songs randomize)))

