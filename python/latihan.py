def CetakJudul():
    NIM = "0109889"
    Nama = "Ary Herijanto"
    Kelas = "1"
    NamaProject = "Hitung Ganjil Genap Dalam Python"

    print(Nama)
    print(NIM)
    print(Kelas)
    print(NamaProject)

def HitungGanjilGenap():
    myinput = input("\nMasukkan Angka ")
    if(int(myinput)%2 == 0):
        print("Angka "+ myinput +" Adalah Bilangan Genap")
    else:
        print("Angka "+ myinput +" Adalah Bilanga11n Ganjil")    


CetakJudul()
HitungGanjilGenap()