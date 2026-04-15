# Atividade 1 - Nível 4: Diagrama de Caso de Uso - Loja Virtual

## 1. Erros Conceituais Identificados

### Erro 1: "Sistema" como ator
O "Sistema" não deve ser um ator. Na UML, atores representam entidades **externas** ao sistema que interagem com ele. O sistema em si é o retângulo que contém os casos de uso — ele não interage consigo mesmo como ator.

### Erro 2: "Cliente emite nota fiscal"
O cliente não emite nota fiscal. Quem emite a nota fiscal é o **sistema**, como consequência de uma compra realizada. A emissão de nota fiscal deve ser um caso de uso incluído automaticamente no processo de compra, não uma ação iniciada pelo cliente.

### Erro 3: "Sistema autentica usuário" como caso de uso isolado com ator Sistema
A autenticação é um caso de uso válido, mas não deve ser associada ao ator "Sistema". A autenticação é um processo interno que é **incluído** (<<include>>) em outros casos de uso que exigem login, como realizar compra.

### Erro 4: "Sistema emite nota fiscal" duplicado
Há dois casos de uso relacionados à emissão de nota fiscal ("Cliente emite nota fiscal" e "Sistema emite nota fiscal"). Deve existir apenas um caso de uso "Emitir Nota Fiscal", incluído automaticamente na compra.

### Erro 5: Relacionamento incorreto entre "emitir nota fiscal" e "realizar compra"
O diagrama original coloca `emitir nota fiscal --include--> realizar compra`, sugerindo que emitir nota fiscal inclui realizar compra. Na verdade, é o contrário: **realizar compra** deve incluir a emissão da nota fiscal, pois a nota é gerada como parte do processo de compra.

### Erro 6: Falta de caso de uso para devolução do cliente
O gerente "aprova devolução", mas não existe um caso de uso para o cliente **solicitar** a devolução. O gerente não inicia o processo sozinho.

---

## 2. Diagrama Corrigido

O diagrama corrigido está no arquivo `diagrama_corrigido.puml` nesta mesma pasta.

**Atores:**
- Cliente (entidade externa)
- Gerente (entidade externa)

**Casos de uso:**
- Fazer Login
- Autenticar Usuário (incluído no login)
- Realizar Compra (inclui login e emissão de nota)
- Solicitar Devolução (ação do cliente)
- Aprovar Devolução (ação do gerente, inclui login)
- Emitir Nota Fiscal (incluído na compra)

---

## 3. Justificativas das Alterações

| Alteração | Justificativa |
|-----------|---------------|
| Remoção do ator "Sistema" | O sistema é representado pelo retângulo de fronteira, não como ator externo. Atores são sempre entidades externas. |
| "Emitir Nota Fiscal" como <<include>> de "Realizar Compra" | A nota fiscal é gerada automaticamente como parte da compra, não é uma ação independente do cliente. |
| Unificação dos casos de uso de nota fiscal | Havia duplicidade. Existe apenas um processo de emissão de nota fiscal no sistema. |
| Inversão do relacionamento include | A compra inclui a nota fiscal, e não o contrário. O caso de uso base é "Realizar Compra". |
| Adição de "Solicitar Devolução" para o Cliente | O gerente aprova, mas quem inicia o pedido de devolução é o cliente. Sem isso, o fluxo fica incompleto. |
| "Autenticar Usuário" como <<include>> de "Fazer Login" | A autenticação é um processo interno obrigatório do login, não um caso de uso iniciado por um ator externo. |
