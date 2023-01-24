DESCRIPTION = "FRED server"
HOMEPAGE = "http://fred.santannapisa.it/"
SECTION = "fred"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

# use this line if you want to get the latest commit of the branch
#SRCREV = "${AUTOREV}"
# or use this line to get a specific commit
SRCREV = "c6b195963ea4ae7fcd509226f02705a3ee1b243e"
SRC_URI = "git://github.com/fred-framework/fred-linux.git/;branch=master"
S = "${WORKDIR}/git"

# change the version
PV = "1.0+git${SRCPV}"

inherit cmake

EXTRA_OECMAKE = "-DCMAKE_INSTALL_PREFIX=/usr"
