import json
from urllib.request import urlopen


cep = "12221540"
url = urlopen("https://viacep.com.br/ws/" + cep + "/json/").read().decode('utf-8')
#resp = urlopen("http://freegeoip.net/json/"+ipAddress).read().decode('utf-8')
cepJson = json.loads(url)

print(cepJson["cep"])
print(cepJson["logradouro"])
print(cepJson["complemento"])
print(cepJson["bairro"])
print(cepJson["localidade"])
print(cepJson["uf"])
