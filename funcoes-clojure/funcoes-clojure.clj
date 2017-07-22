; Exemplos usados no terceiro artigo de Clojure.

; Função map, espera uma função e uma lista para executar uma ação em cada item da lista
(map inc [1 2 3 4 5 6])

; Basicamente reduz a uma lista executando uma acação, no caso abaixo uma soma
(reduce + [1 2 3])


; Função filter, como o proprio nome diz, serve para filtrar itens de uma lista
(filter even? [12 2 3 4])


; Abaixo definimos uma função pares, que não faz nada além de receber uma lista e filtrar os pares com a
; função filter
(defn pares [& args]
  (filter even? args))

(pares 1 2 3 4 5 6 7 8 9 10)


