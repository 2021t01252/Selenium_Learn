<b>Day 02 Locators</b>

<b>findElement() ----> Single Web element</b><br />
<b>findElements() ----> Multiple Web elements</b>

Scanario 1 : Locator matching with single web element <br />

<ul>
<li>findElement(loc) -----> single web element  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  datatype = WebElement</li>
<li>findElement<b>s</b>(loc)---->Single web element &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; datatype = List &lt;WebElement&gt;</li>
</ul>

Scanario 2 : Locator matching with multi web elements <br />

<ul>
<li>findElement(loc) -----> single web element  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  datatype = WebElement</li>
<li>findElement<b>s</b>(loc)---->multiple web element &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; datatype = List &lt;WebElement&gt;</li>
</ul>

Scanario 3 : Locator is not matching with any element/s <br />

<ul>
<li>findElement(loc) -----> NO such Element Exception</li>
<li>findElement<b>s</b>(loc)----> Returns 0</li>
</ul>
