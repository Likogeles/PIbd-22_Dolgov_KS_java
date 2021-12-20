import java.awt.*;

public class Ship {
    /// <summary>
    /// Левая координата отрисовки катера
    /// </summary>
    private float _startPosX;
    /// <summary>
    /// Правая кооридната отрисовки катера
    /// </summary>
    private float _startPosY;
    /// <summary>
    /// Ширина окна отрисовки
    /// </summary>
    private int _pictureWidth;
    /// <summary>
    /// Высота окна отрисовки
    /// </summary>
    private int _pictureHeight;
    /// <summary>
    /// Ширина отрисовки катера
    /// </summary>
    private int carWidth = 210;
    /// <summary>
    /// Высота отрисовки катера
    /// </summary>
    private int carHeight = 80;
    /// <summary>
    /// Максимальная скорость
    /// </summary>
    public int MaxSpeed;
    public int GetMaxSpeed()
    {
        return MaxSpeed;
    }
    public void SetMaxSpeed(int maxSpeed)
    {
        this.MaxSpeed = maxSpeed;
    }
    /// <summary>
    /// Вес катера
    /// </summary>
    public int Weight;
    public int GetWeight()
    {
        return Weight;
    }
    private void SetWeight(int weight)
    {
        this.Weight = weight;
    }
    /// <summary>
    /// Основной цвет
    /// </summary>
    public Color MainColor;
    public Color GetMainColor()
    {
        return MainColor;
    }
    public void SetMainColor(Color mainColor)
    {
        this.MainColor = mainColor;
    }
    /// <summary>
    /// Дополнительный цвет
    /// </summary>
    public Color DopColor;
    public Color GetDopColor()
    {
        return DopColor;
    }
    public void SetDopColor(Color dopColor)
    {
        this.DopColor = dopColor;
    }
    /// <summary>
    /// Признак наличия стекла
    /// </summary>
    public boolean Window;
    public boolean GetWindow()
    {
        return Window;
    }
    public void SetWindow(boolean window)
    {
        this.Window = window;
    }
    /// <summary>
    /// Признак наличия полосок
    /// </summary>
    public boolean Lines;
    public boolean GetLines()
    {
        return Lines;
    }
    public void SetLines(boolean lines)
    {
        this.Lines = lines;
    }
    /// <summary>
    /// Признак наличия моторов
    /// </summary>
    public boolean Rotors;
    public boolean GetRotors()
    {
        return Rotors;
    }
    public void SetRotors(boolean rotors)
    {
        this.Rotors = rotors;
    }
    /// <summary>
    /// Количество моторов
    /// </summary>
    public int RotorsNum;
    public int GetRotorsNum()
    {
        return RotorsNum;
    }
    public void SetRotorsNum(int rotorsNum)
    {
        this.RotorsNum = rotorsNum;
    }
    /// <summary>
    /// Инициализация свойств
    /// </summary>
    /// <param name="maxSpeed">Максимальная скорость</param>
    /// <param name="weight">Вес катера</param>
    /// <param name="mainColor">Основной цве</param>
    /// <param name="dopColor">Дополнительный цвет</param>
    /// <param name="window">Признак наличия стекла</param>
    /// <param name="lines">Признак наличия полосок</param>
    /// <param name="rotors">Признак наличия моторов</param>
    /// <param name="rotorsNum">Количество моторов</param>
    public Ship(int maxSpeed, int weight, Color mainColor, Color dopColor,
                     boolean window, boolean lines, boolean rotors, int rotorsNum)
    {
        MaxSpeed = maxSpeed;
        Weight = weight;
        MainColor = mainColor;
        DopColor = dopColor;
        Window = window;
        Lines = lines;
        Rotors = rotors;
        RotorsNum = rotorsNum;
    }
    /// <summary>
    /// Установка позиции катера
    /// </summary>
    /// <param name="x">Координата X</param>
    /// <param name="y">Координата Y</param>
    /// <param name="width">Ширина картинки</param>
    /// <param name="height">Высота картинки</param>
    public void SetPosition(int x, int y, int width, int height)
    {
        // Продумать логику
    }
    /// <summary>
    /// Изменение направления перемещения
    /// </summary>
    /// <param name="direction">Направление</param>
    public void MoveTransport(Direction direction)
    {
        float step = MaxSpeed * 100 / Weight;
        switch (direction)
        {
            // вправо
            case Right:
                if (_startPosX + step < _pictureWidth - carWidth)
                {
                    _startPosX += step;
                }
                break;
            //влево
            case Left:
                // Продумать логику
                break;
            //вверх
            case Up:
                // Продумать логику
                break;
            //вниз
            case Down:
                if (_startPosY + step < _pictureHeight - carHeight)
                {
                    _startPosY += step;
                }
                break;
        }
    }
    /// <summary>
    /// Отрисовка катера
    /// </summary>
    /// <param name="g"></param>
    public void DrawTransport(Graphics g)
    {
        g.fillRect(100, 100, 50,50);
    }
}
