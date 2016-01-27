(ns playitloud.videocoll)

(def videocoll (atom ["Lost highway" "Black swan" "I hired a contract killer"]))

(defn get-video [videospec]
  (find @videocoll videospec))

(defn add-video [video]
  (swap! videocoll conj video))
