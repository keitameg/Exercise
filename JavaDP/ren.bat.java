for /r %%i in (src.com.activemesa.*) do call :sub "%%i" "%%~ni"

:sub
set fname=%1
set dname=%2
echo�@�V���[�v�F%fname%
echo�@�f�X�g�F%dname%
set dname=%dname:src.com.activemesa=yama%
ren %1 %dname%
goto :EOF

