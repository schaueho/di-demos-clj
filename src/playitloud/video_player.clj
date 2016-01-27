(ns playitloud.video-player
  (:require [playitloud.speaker :as speaker :refer [blare]]
            [playitloud.videocoll :as vc :refer [get-video]]))

(defn- show-video [video]
  (str "Showing " video))

(defn video-play [videospec]
  (let [video (get-video videospec)]
    (do
      (show-video video)
      (blare video))))

