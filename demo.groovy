// Groovy Demo
def stringToHash = 'Groovy - CSC434'

// Simple Hashing and Mapping
def hashes = [md5: stringToHash.md5(), md2: stringToHash.digest('MD2'), sha1: stringToHash.digest('SHA-1'), sha256: stringToHash.digest('SHA-256')] 

def hashValues = [md5: 'b161b126527818e8c77a084d10ec50d2', md2: '23e07fb63153e1c0f8a1df90ea843392', sha1: '18c32ec9c335d4abca43c65c85e0bcf05937e83c', sha256: '0754fb5fc9b269342ce718dbcc548356a82a60c112b5f430128c5f5446802f56']

// Assertations 
assert hashes.md5 == 'asdasd'

// All Together, with String interpolation
for (hash in hashes.keySet()) {
  println "$hash: ${hashes[hash]}"
  assert hashes[hash] == hashValues[hash]
}
