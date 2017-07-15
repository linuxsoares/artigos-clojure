; Exemplos de código de Hello World para os artigos Clojure
; Artigo Criando funções em Clojure

; Usamos defn para definir funções

(defn hello-world []
  (println "Hello World"))

(hello-world)

(defn hello-world-with-param [name]
  (println "Hello" name))

(hello-world-with-param "Clojure")

; Usando args em Clojure - BRINDE do próximo artigo

(defn hello-world-with-args [& args]
  (println args))

(hello-world-with-args "Gilmar" "Soares")


; O unico detalhe é que precisamos usar reduce para somar a lista passada por parâmetro
; esse é um assunto para o próximo artigo

(defn sum-list [& nums]
  (reduce + nums))

(sum-list 1 2 3 4 5)

