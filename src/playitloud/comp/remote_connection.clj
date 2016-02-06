(ns playitloud.comp.remote-connection)

(defprotocol RemoteDataConnectionProtocol
  (connect [connection source])
  (disconnect [connection source])
  (transmit [connection data])
  (send-command [connection command]))
