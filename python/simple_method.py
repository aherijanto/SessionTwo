import math
class SimpleMethod:

    def CetakJudul(self):
        Title01 = 'Cetak Judul dari Class Method'
        Title02 = 'Method ini dipanggil dari Main program'
        print(Title01)
        print(Title02)

    def HitungLuasPersegi(self):
        print('\nMenghitung Luas Persegi Dari Method')
        Panjang = 10
        Lebar = 4
        Luas = Panjang * Lebar
        print('Luas Persegi Panjang  = %2.2f2'%Luas)

    def HitungLuasLingkaran(self):
        print('\nMenghitung Luas Lingkaran Dari Method')
        r = input('Masukkan JariJari = ')
        LuasLingkaran = math.pi * float(r) * float(r)
        print('Luas Lingkaran = %5.2f'%LuasLingkaran)

Judul01 = 'Cetak Judul Tanpa Class Method'
Judul02 = 'Judul02 Dicetak di sini'
print(Judul01)
print(Judul02)
print('\n')
myMethod = SimpleMethod()
myMethod.CetakJudul()
myMethod.HitungLuasPersegi()
myMethod.HitungLuasLingkaran()