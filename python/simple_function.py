import math

def CetakJudul():
    Title01 = 'Cetak Judul dari Function'
    Title02 = 'Function ini dipanggil dari Main program'
    print(Title01)
    print(Title02)

def HitungLuasPersegi():
    print('\nMenghitung Luas Persegi Dari Function')
    Panjang = 10
    Lebar = 4
    Luas = Panjang * Lebar
    print('Luas Persegi Panjang  = %2.2f2'%Luas)

def HitungLuasLingkaran():
    print('\nMenghitung Luas Lingkaran Dari Function')
    r = input('Masukkan JariJari = ')
    LuasLingkaran = math.pi * float(r) * float(r)
    print('Luas Lingkaran = %5.2f'%LuasLingkaran)


Judul01 = 'Cetak Judul Tanpa Function'
Judul02 = 'Judul02 Dicetak di sini'
print(Judul01)
print(Judul02)
print('\n')
CetakJudul()
HitungLuasPersegi()
HitungLuasLingkaran()
