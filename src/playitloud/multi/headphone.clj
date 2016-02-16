(ns playitloud.multi.headphone
  (:require [playitloud.multi.output-device :refer [blare]]))

(defmethod blare :headphone [device song]
  (let [result (str "Headphone plays " song)]
    (println result)
    result))

