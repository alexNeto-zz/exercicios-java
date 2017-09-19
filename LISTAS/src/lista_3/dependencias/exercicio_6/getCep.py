import json
import sys
from urllib.request import urlopen

#
# script para pegar um determinado cep e devolver os dados
#
def getcep(cep):

    url = urlopen("https://viacep.com.br/ws/" + cep + "/json/").read().decode('utf-8')
    cepJson = json.loads(url)

    print(cepJson["cep"])
    print(cepJson["logradouro"])
    print(cepJson["complemento"])
    print(cepJson["bairro"])
    print(cepJson["localidade"])
    print(cepJson["uf"])

cep = sys.argv[1]
getcep(cep)
