(ns playitloud.proto.output-device)

(defprotocol OutputDevice
  (blare [device sound])
  (inc-volume [device])
  (dec-volume [device]))

  
